package br.com.moon.springwebapp.spring.exception;

/**
 * extendendo a classe de runtime exception estaremos fazendo
 * com que essa classe tenha o mesmo comportamento
 */
public class EventFullException extends RuntimeException{

    public EventFullException(){ super("Evento está lotado");}

    public EventFullException(String message) {
        super(message);
    }
}
