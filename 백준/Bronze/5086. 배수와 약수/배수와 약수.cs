using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true) {
                string[] str = Console.ReadLine().Split(" ");
                if (int.Parse(str[0]) == 0 && int.Parse(str[1]) == 0) {
                    break;
                }
                
                if (int.Parse(str[1]) % int.Parse(str[0]) == 0) {
                    Console.WriteLine("factor");
                } else if (int.Parse(str[0]) % int.Parse(str[1]) == 0) {
                    Console.WriteLine("multiple");
                } else {
                    Console.WriteLine("neither");
                }
            }
        }
    }
}

