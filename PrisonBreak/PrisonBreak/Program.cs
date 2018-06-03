using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrisonBreak
{
    class Program
    {
        public static readonly int BOARD_SIZE = 10;
        public static int[,] board;

        private static bool foundExit = false;        
        private static List<KeyValuePair<int, int>> doorPositions = new List<KeyValuePair<int, int>>();
        private static readonly int NO_VALUE = -1;

        public static void printMaze()
        {
            for (int i = 0; i < BOARD_SIZE; i++)
            {
                for (int j = 0; j < BOARD_SIZE; j++)
                {
                    Console.Write("{0} ", board[i, j]);
                }
                Console.WriteLine();
            }
            Console.WriteLine();
            Console.WriteLine();
        }

        static void Main(string[] args)
        {
            // Get random board
            board = PrisonBreakTools.getNewMaze(BOARD_SIZE);

            printMaze();

            // Get random staring point
            Random rand = new Random();
            int startX, startY;
            do
            {
                startX = rand.Next(0, BOARD_SIZE);
                startY = rand.Next(0, BOARD_SIZE);
            }
            while (board[startX, startY] != TileTypes.EMPTY || startX == 0 || startY == 0 || startX == BOARD_SIZE - 1 || startY == BOARD_SIZE - 1);

            Console.WriteLine("Start: {0} {1}", startX, startY);

            // Your output goes here
            int[,] newBoard = (int[,])board.Clone();
            int endX;
            int endY;
            if (IsExitAvailable(startX, startY, NO_VALUE, NO_VALUE, newBoard, out endX, out endY))
            {
                Console.WriteLine($"End X:{endX}\t End Y:{endY}");

                //filter the doors
                findBlockingDoors(startX, startY, endX, endY);
                //print blocking doors Cordinates
                if (doorPositions.Any())
                {
                    Console.WriteLine("Blocking Doors :");
                    foreach (var doorCordinates in doorPositions)
                    {
                        Console.WriteLine($"X cordinate:{doorCordinates.Key}\t\tY cordinate:{doorCordinates.Value}");
                    }
                }
                else
                {
                    Console.WriteLine("No blocking Doors");
                }


            }
            else
            {
                Console.WriteLine("No Path");
            }

            Console.ReadKey();
        }

        private static void findBlockingDoors(int startX, int startY, int endX, int endY)
        {
            //find which doors block path and remove others
            foreach (var door in doorPositions)
            {
                int possibleX;
                int possibleY;
                int[,] checkingDoorsBoard = (int[,])board.Clone();
                checkingDoorsBoard[door.Key, door.Value] = TileTypes.WALL;
                //find and remove all unnecessary doors which do not block Exit
                if (IsExitAvailable(startX, startY, NO_VALUE, NO_VALUE, checkingDoorsBoard, out possibleX, out possibleY))
                {
                    if (possibleX != -1 && possibleY != -1)
                    {
                        doorPositions.Remove(new KeyValuePair<int, int>(door.Key, door.Value));
                    }
                }

            }
        }

        private static bool IsExitAvailable(int startX, int startY, int previousX, int previousY, int[,] inputBoard, out int exitX, out int exitY)
        {
            
            exitX = NO_VALUE;
            exitY = NO_VALUE;
            if (inputBoard[startX, startY] == TileTypes.DOOR)
            {
                doorPositions.Add(new KeyValuePair<int, int>(startX, startY));
            }
            //check for position at the edges
            if (!((startX > 0 && startX < BOARD_SIZE - 1) &&
                (startY > 0 && startY < BOARD_SIZE - 1)))
            {
                foundExit = true;
                exitX = startX;
                exitY = startY;
                return true;
            }
            //if exit was found
            if (foundExit == true)
            {
                return true;
            }
            inputBoard[startX, startY] = TileTypes.WALL;

            //test purpose
            // Console.WriteLine($"StartX: {startX} StartY: {startY} PrevX: {previousX} PrevY: {previousY}");

            //checking positions and check for exitfoun after every search
            if ((inputBoard[startX + 1, startY] != TileTypes.WALL) &&
            !(previousX == startX + 1 && previousY == startY))
            {
                foundExit = IsExitAvailable(startX + 1, startY, startX, startY, inputBoard, out exitX, out exitY);

            }
            if (foundExit == true)
            {
                return true;
            }

            if ((inputBoard[startX - 1, startY] != TileTypes.WALL) &&
                !(previousX == startX - 1 && previousY == startY))
            {
                foundExit = IsExitAvailable(startX - 1, startY, startX, startY, inputBoard, out exitX, out exitY);
            }
            if (foundExit == true)
            {
                return true;
            }

            if ((inputBoard[startX, startY + 1] != TileTypes.WALL) &&
                !(previousX == startX && previousY == startY + 1))
            {
                foundExit = IsExitAvailable(startX, startY + 1, startX, startY, inputBoard, out exitX, out exitY);
            }
            if (foundExit == true)
            {
                return true;
            }

            if ((inputBoard[startX, startY - 1] != TileTypes.WALL) &&
                !(previousX == startX && previousY == startY - 1))
            {
                foundExit = IsExitAvailable(startX, startY - 1, startX, startY, inputBoard, out exitX, out exitY);
            }
            if (foundExit == true)
            {
                return true;
            }


            //if no path found
            return false;

        }
    }
}
