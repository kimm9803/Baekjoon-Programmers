using System;
using System.Text;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());
            StringBuilder sb;
            for (int i = 0; i < T; i++)
            {
                sb = new StringBuilder();
                string[] rs = Console.ReadLine().Split(" ");
                for (int j = 0; j < rs[1].Length; j++)
                {
                    for (int k = 0; k < int.Parse(rs[0]); k++)
                    {
                        sb.Append(rs[1][j]);
                    }
                }
                Console.WriteLine(sb.ToString());
            }
        }
    }
}

