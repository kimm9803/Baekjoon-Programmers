using System.Text;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[31];
            arr[0] = 1;
            for (int i = 0; i < 28; i++)
            {
                int n = int.Parse(Console.ReadLine());
                arr[n] = 1;
            }

            for (int i = 1; i <= 30; i++)
            {
                if (arr[i] == 0)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}

