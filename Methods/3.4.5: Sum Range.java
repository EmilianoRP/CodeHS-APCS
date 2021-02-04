public int sumFrom(int a, int b)
{
    int result = 0; // this states the inital value of result as we as defining it
    
    while ( a <= b) //so you dont go past what b is
    {
        result += a;//both of these work for adding 
        a++;
    }
    return result;//just returning the result
}
