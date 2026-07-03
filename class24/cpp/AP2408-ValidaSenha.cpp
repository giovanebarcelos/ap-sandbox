#include <iostream>
#include <string>
bool senhaForte(std::string s){return s.size()>=8;}
int main(){std::cout<<"12345678 forte? "<<senhaForte("12345678")<<"\n";std::cout<<"123 forte? "<<senhaForte("123")<<"\n";return 0;}
