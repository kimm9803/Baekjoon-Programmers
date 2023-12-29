using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            if (str == " ")
            {
                Console.WriteLine(0);
            } else
            {
                string[] strArr = str.Trim().Split(' ');
                Console.WriteLine(strArr.Length);
            }
        }
    }
}

