package MessengerLib_app;

public interface MessageProtocol 
{
	public boolean send(Message s);
	public boolean receive(Message r);
}
