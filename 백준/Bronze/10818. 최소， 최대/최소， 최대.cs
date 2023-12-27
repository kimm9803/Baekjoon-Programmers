namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] str = Console.ReadLine().Split(' ');

            int min = 1000001;
            int max = -1000001;

            for (int i = 0; i < n; i++)
            {
                if (int.Parse(str[i]) > max)
                {
                    max = int.Parse(str[i]);
                } 
                if (int.Parse(str[i]) < min)
                {
                    min = int.Parse(str[i]);
                }
            }

            Console.WriteLine(min + " " + max);
        }
    }
}

