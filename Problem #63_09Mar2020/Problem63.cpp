#include <iostream>
#include <string>
#include <vector>

using namespace std;

/*
This problem was asked by Microsoft.

Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.

For example, given the following matrix:

[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]
and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given the target word 'MASS', you should return true, since it's the last row.

*/

bool compareVectors (vector<char> vec, vector<char> word)
{
  if (vec == word)
    return true;

  return false;
}

void print(vector <char> const &a) {
   
  for(int i=0; i < a.size(); i++)
    cout << a.at(i) << ' ';
  cout << endl;
}


bool isExist (vector < vector <char> > board, string word)
{
  vector<char> w(word.begin(), word.end());
  int size = board[0].size();

  // Check across
  for (int i = 0; i < size; i++){
    print(board[i]);
    if (compareVectors(board[i], w)){
      
      return true;
    }   
  }

  vector<char> x;
  // Check horizontal
  for (int i = 0; i < size; i++){
    x.clear();
    for (int j = 0; j < size; j++)
    {
      x.push_back(board[j][i]);
    }
    print(x);

    if (compareVectors(x, w))
      return true;
  }

  return false;
}


int main() {
  vector < vector <char> > board{ {'F', 'A', 'C', 'I'},{'O', 'B', 'Q', 'P'},{'A', 'N', 'O', 'B'},{'M', 'A', 'S', 'S'}};
  string target1 = "FOAM";
  string target2 = "MASS";

  if (isExist(board, target1))
    cout<< "Found" <<endl;
}