package co.com.ceiba.phman.application.usecase;


public interface Command{
	public void execute();
	public Receiver action();
}
