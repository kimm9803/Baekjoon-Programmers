

using System.Text;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] nx = Console.ReadLine().Split(' ');
            int n = int.Parse(nx[0]);
            int x = int.Parse(nx[1]);

            string[] str = Console.ReadLine().Split(' ');

            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < str.Length; i++)
            {
                if (int.Parse(str[i]) < x)
                {
                    answer.Append(str[i] + " ");
                }
            }

            Console.WriteLine(answer.ToString());
        }
    }
}

