#include <iostream>
#include <vector>
#include <string>
using namespace std;

typedef vector<string> vs;

int main(){
    int n;
    cin>>n;
    vs s,ss;
    
    
    for(int i=0;i<n;++i){
        string word;
        cin>>word;
        s.push_back(word);
    }

    for(int i=0;i<37;++i){
       string line;
       if(line=="-1")
            break;

       getline(cin,line);
       ss.push_back(line);
    }


        
    
    
}
