package co.com.ajac.usecase;

import java.util.Optional;

public interface Command<R,M>{
	public Optional<R> execute(M query);
}
