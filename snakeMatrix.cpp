//This function gets the size of an n x m matrix and returns the elements of a matrix in the snake pattern.

#include <iostream>
#include <vector>

std::vector<int> snakeMatrix(std::vector<std::vector<int>>& matrix)
{

    std::size_t n = matrix.size();
    std::size_t m = matrix[0].size();
    std::vector<int> snakeVector;
    for (int i = 0; i < n; ++i)
    {
        if (i % 2 == 0) 
            for (int j = 0; j < m; ++j)
                snakeVector.push_back(matrix[i][j]);
        else 
            for (int j = m - 1; j >= 0; --j)
                snakeVector.push_back(matrix[i][j]);
    }

    return snakeVector;
}

