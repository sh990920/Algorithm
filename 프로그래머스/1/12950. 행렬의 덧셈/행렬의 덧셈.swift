func solution(_ arr1:[[Int]], _ arr2:[[Int]]) -> [[Int]] {
    var result = Array<Array<Int>>()

    for i in 0 ..< arr1.count {
        var arr = Array<Int>()
        for j in 0 ..< arr1[i].count {
            let num = arr1[i][j] + arr2[i][j]
            arr.append(num)
        }
        result.append(arr)
    }
    return result
}