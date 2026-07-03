#include <iostream>
int main(){int a=3,b=3,c=5;if(a==b&&b==c)std::cout<<"Equilatero\n";else if(a==b||b==c||a==c)std::cout<<"Isosceles\n";else std::cout<<"Escaleno\n";return 0;}
