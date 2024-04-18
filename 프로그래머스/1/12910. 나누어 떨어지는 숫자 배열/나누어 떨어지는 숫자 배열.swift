func solution(_ arr:[Int], _ divisor:Int) -> [Int] {
    var result = Array<Int>()
    
    for i in arr {
        if(i % divisor == 0){
            result.append(i)
        }
    }
    
    if(result.count == 0) {
        result.append(-1)
    } else {
        result.sort()
    }
    
    return result
}