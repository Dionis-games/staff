#include <iostream>
#include <thread>

class background_task{
public:
	void operator()()const
	{
	        std::cout<<"Hello from class\n";
	}
};

int main(){
	background_task f;
	std::thread t(f);
	t.join();
	return 0;
}
