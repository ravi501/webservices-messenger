package org.ravi.javabrains.messenger.exception;

public class DataNotFoundException extends RuntimeException
{

    /**
     * 
     */
    private static final long serialVersionUID = 9165761244457024048L;
    
    public DataNotFoundException(String message)
    {
       super(message); 
    }
    
}
