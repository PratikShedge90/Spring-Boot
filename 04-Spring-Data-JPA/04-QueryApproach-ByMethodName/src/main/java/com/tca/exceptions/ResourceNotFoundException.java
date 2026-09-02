package com.tca.exceptions;

public class ResourceNotFoundException extends RuntimeException
{
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
}
