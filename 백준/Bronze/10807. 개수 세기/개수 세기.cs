using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] str = Console.ReadLine().Split();
            int v = int.Parse(Console.ReadLine());
            int answer = 0;

            for (int i = 0; i < str.Length; i++)
            {
                if (int.Parse(str[i]) == v)
                {
                    answer++;
                }
            }

            Console.WriteLine(answer);
        }
    }
}

