//using System;
//using System.Collections.Generic;
//using System.Linq;
//using System.Text;
//using System.Threading.Tasks;

//namespace PrisonBreak
//{
//    class test
//    {
//        public static readonly int BOARD_SIZE = 15;
//        public static int[,] board;
//        private static bool foundExit = false;
//        private static int endX;
//        private static int endY;

//        public static void printMaze()
//        {
//            for (int i = 0; i < BOARD_SIZE; i++)
//            {
//                for (int j = 0; j < BOARD_SIZE; j++)
//                {
//                    Console.Write("{0} ", board[i, j]);
//                }
//                Console.WriteLine();
//            }
//            Console.WriteLine();
//            Console.WriteLine();
//        }

//        static void Main(string[] args)
//        {
//            // Get random board
//            // board = PrisonBreakTools.getNewMaze(BOARD_SIZE);
//            board = new int[15, 15] {{1 ,1, 0, 0, 2, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
//{0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
//{1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0,1, 0, 2 ,0},
//{0, 0, 0 ,1, 0, 1 ,0 ,0 ,1 ,1, 0, 0, 1, 0 ,1},
//{1 ,1 ,0 ,1 ,2 ,1 ,1 ,1 ,0 ,2, 1, 1 ,0, 1 ,2},
//{1 ,1, 0 ,1, 1, 1 ,1 ,0 ,0, 1 ,1, 0 ,1, 1 ,0},
//{0 ,0 ,1 ,0 ,1, 0 ,0, 0 ,0 ,0 ,2 ,1 ,0 ,1 ,0},
//{0, 0, 1 ,1 ,0 ,1 ,0 ,0 ,0 ,0, 2 ,1, 0 ,0 ,0},
//{1 ,1 ,1 ,0, 1 ,1 ,0 ,1, 1 ,1, 0, 1, 0 ,0 ,1},
//{0 ,1, 1, 1, 1, 1, 0 ,0, 1, 1, 2, 2, 0 ,0 ,2},
//{2 ,0 ,0 ,1 ,1 ,0 ,1, 0 ,1 ,1, 2, 0, 0 ,0 ,1},
//{0 ,0, 1, 0, 1, 0 ,1 ,1 ,1, 1, 0, 1, 0, 1, 1},
//{1 ,1, 1 ,1 ,1 ,0, 0, 1 ,0, 1 ,0 ,1, 0, 1, 1},
//{0 ,0, 0, 0, 1, 2 ,0 ,1, 0, 1, 0, 1, 1, 1, 1},
//{0 ,1 ,1 ,2 ,0 ,0, 1, 1, 0, 0 ,1 ,1, 1, 1, 1}};
//            printMaze();

//            // Get random staring point
//            Random rand = new Random();
//            int startX, startY;
//            //do
//            //{
//            //    startX = rand.Next(0, BOARD_SIZE);
//            //    startY = rand.Next(0, BOARD_SIZE);
//            //}
//            //while (board[startX, startY] != TileTypes.EMPTY || startX == 0 || startY == 0 || startX == BOARD_SIZE-1 || startY == BOARD_SIZE-1);
//            startX = 7;
//            startY = 8;
//            Console.WriteLine("Start: {0} {1}", startX, startY);

//            // Your output goes here

//            List<KeyValuePair<int, int>> doorPositions = new List<KeyValuePair<int, int>>();
//            if (IsExitAvailable(startX, startY, -1, -1))
//            {
//                Console.WriteLine($"End X:{endX}\t End Y:{endY}");
//            }
//            else
//            {
//                Console.WriteLine("No Path");
//            }

//            Console.ReadKey();
//        }

//        private static bool IsExitAvailable(int startX, int startY, int previousX, int previousY)
//        {


//            if (!((startX > 0 && startX < BOARD_SIZE - 1) &&
//                (startY > 0 && startY < BOARD_SIZE - 1)))
//            {
//                foundExit = true;
//                endX = startX;
//                endY = startY;
//                return true;
//            }
//            if (foundExit == true)
//            {
//                return true;
//            }
//            board[startX, startY] = TileTypes.WALL;
//            Console.WriteLine($"StartX: {startX} StartY: {startY} PrevX: {previousX} PrevY: {previousY}");

//            if ((board[startX + 1, startY] != TileTypes.WALL) &&
//            !(previousX == startX + 1 && previousY == startY))
//            {
//                foundExit = IsExitAvailable(startX + 1, startY, startX, startY);

//            }
//            if (foundExit == true)
//            {
//                return true;
//            }
//            if ((board[startX - 1, startY] != TileTypes.WALL) &&
//                !(previousX == startX - 1 && previousY == startY))
//            {
//                foundExit = IsExitAvailable(startX - 1, startY, startX, startY);
//            }
//            if (foundExit == true)
//            {
//                return true;
//            }
//            if ((board[startX, startY + 1] != TileTypes.WALL) &&
//                !(previousX == startX && previousY == startY + 1))
//            {
//                foundExit = IsExitAvailable(startX, startY + 1, startX, startY);
//            }
//            if (foundExit == true)
//            {
//                return true;
//            }
//            if ((board[startX, startY - 1] != TileTypes.WALL) &&
//                !(previousX == startX && previousY == startY - 1))
//            {
//                foundExit = IsExitAvailable(startX, startY - 1, startX, startY);
//            }

//            if (foundExit == true)
//            {
//                return true;
//            }




//            return false;

//        }
//    }
//}
