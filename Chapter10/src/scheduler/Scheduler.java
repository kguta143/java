package scheduler;

public interface Scheduler {
	//스케줄러의 기능 2가지
	void getNextCall();
	void sendCallToAgent();
}
