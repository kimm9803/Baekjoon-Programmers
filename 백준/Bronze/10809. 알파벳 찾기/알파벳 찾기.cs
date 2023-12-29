using System;
using System.Text;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            string alphabet = "abcdefghijklmnopqrstuvwxyz";
            int[] arr = new int[alphabet.Length];
            Array.Fill(arr, -1);

            for (int i = 0; i < str.Length; i++)
            {
                for (int j = 0; j < alphabet.Length; j++)
                {
                    if (str[i] == alphabet[j] && arr[j] == -1)
                    {
                        arr[j] = i;
                        break;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.Length; i++)
            {
                sb.Append(arr[i] + " ");
            }

            Console.WriteLine(sb.ToString());
        }
    }
}

