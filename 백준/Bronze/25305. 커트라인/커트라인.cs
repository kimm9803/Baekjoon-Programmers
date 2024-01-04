using System;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args) 
        {
            string[] nk = Console.ReadLine().Split(" ");
            string[] scores_str = Console.ReadLine().Split(" ");

            int[] scores = new int[int.Parse(nk[0])];
            for (int i = 0; i < scores.Length; i++) {
                scores[i] = int.Parse(scores_str[i]);
            }

            Array.Sort(scores);
            
            Console.WriteLine(scores[scores.Length - int.Parse(nk[1])]);
        }
    }
}

