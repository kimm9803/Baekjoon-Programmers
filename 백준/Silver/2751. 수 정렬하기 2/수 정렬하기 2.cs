using System;
using System.Collections.Generic;
using System.Text;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args) 
        {
            int N = int.Parse(Console.ReadLine());
            List<int> list = new List<int>();

            for (int i = 0; i < N; i++) {
                list.Add(int.Parse(Console.ReadLine()));
            }

            list.Sort();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.Append(list[i]).Append('\n');
            }

            Console.WriteLine(sb.ToString());
            
        }
    }
}

