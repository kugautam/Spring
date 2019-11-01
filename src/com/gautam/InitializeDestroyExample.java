package com.gautam;

/* Bean Life cycle   by setting the init()    and  destory()
   In this way we have our Custom Method Acting
   as a initializing and destory method
*/
public class InitializeDestroyExample
{
    public void initializationMethod()
    {
        System.out.println("Initialization method called");
    }
    
    public void display()
    {
        System.out.println("Welcome to JavaInterviewPoint!!!");
    }
    
    public void destroyMethod()
    {
        System.out.println("Destroy method called");
    }
}