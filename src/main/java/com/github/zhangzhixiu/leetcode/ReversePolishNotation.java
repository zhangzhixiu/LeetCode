package com.github.zhangzhixiu.leetcode;

import java.util.LinkedList;
import java.util.List;

public class ReversePolishNotation
{
    public int evalRPN(String[] tokens) 
    {
    	List<String> tokenList = new LinkedList<String>();
    	
        for(int i=0; i<tokens.length; i++)
        {
        	tokenList.add(tokens[i]);
        }
        
        reverse(tokenList);
        
        return Integer.valueOf(tokenList.get(0));
    }
    
    private void reverse(List<String> tokenList)
    {
//    	ListIterator<String> iter = tokenList.listIterator();
//        while(iter.hasNext())
//        {
//        	if(isOperator(iter.next()))
//        	{
//        		String operator = iter.previous();
//        		String n2 = iter.previous();
//        		String n1 = iter.previous();
//        		int temp = calculate(n1, n2, operator);
//        		
//        		iter.remove();
//        		iter.next();
//        		iter.remove();
//        		iter.next();
//        		iter.set(String.valueOf(temp));
//        	}
//        }
    	
    	for(int i=0; i<tokenList.size(); i++)
    	{
    		if(isOperator(tokenList.get(i)))
    		{
    			int temp = calculate(tokenList.get(i-2), tokenList.get(i-1), tokenList.get(i));
    			
    			i = i-2;
    			tokenList.remove(i);
    			tokenList.remove(i);
    			tokenList.set(i, String.valueOf(temp));
    		}
    	}
    }
    
    private Boolean isOperator(String token)
    {
    	if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
    		return true;
    	else
    		return false;
    }
    
    private int calculate(String n1, String n2, String operator)
    {
    	int number1 = Integer.valueOf(n1);
    	int number2 = Integer.valueOf(n2);
    	
    	if(operator.equals("+"))
    	{
    		return number1+number2;
    	}
    	else if(operator.equals("-"))
    	{
    		return number1-number2;
    	}
    	else if(operator.equals("*"))
    	{
    		return number1*number2;
    	}
    	else if(operator.equals("/"))
    	{
    		return number1/number2;
    	}
    	else
    	{
    		return 0;
    	}
    }
}
