using System;
using System.Text;
using System.Collections.Generic;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> list;
            int sum;
            StringBuilder sb;

            while (true) {
                int num = int.Parse(Console.ReadLine());
                sb = new StringBuilder();

                if (num == -1) {
                    break;
                }
                
                list = new List<int>();
                sum = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        list.Add(i);
                        sum += i;
                    }
                }

                if ((sum - num) == num) {
                    sb.Append(num + " = 1");
                    for (int i = 1; i < list.Count - 1; i++) {
                        sb.Append(" + " + list[i]);
                    }
                    Console.WriteLine(sb.ToString());
                } else {
                    Console.WriteLine($"{num} is NOT perfect.");
                }
            }

        }
    }
}

