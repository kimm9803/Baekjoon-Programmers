using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] str = Console.ReadLine().Split(' ');
            string strA = "";
            string strB = "";

            for (int i = str[0].Length-1; i >= 0; i--)
            {
                strA += str[0][i];
            }

            for (int i = str[1].Length - 1; i >= 0; i--)
            {
                strB += str[1][i];
            }

            if (int.Parse(strA) > int.Parse(strB))
            {
                Console.WriteLine(strA);
            } else
            {
                Console.WriteLine(strB);
            }
        }
    }
}

