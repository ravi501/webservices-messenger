package org.ravi.javabrains.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.ravi.javabrains.messenger.model.ErrorMessage;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>
{

    @Override
    public Response toResponse( Throwable exception )
    {
        ErrorMessage errorMessage = new ErrorMessage( exception.getMessage(), 404, "Exception" );
        return Response.status( Status.NOT_FOUND ).entity( errorMessage ).build();
    }

}