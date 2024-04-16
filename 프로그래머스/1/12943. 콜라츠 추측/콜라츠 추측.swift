func solution(_ num:Int) -> Int {
    var result = 0
    var count = 0
    var n:Int64 = Int64(num)
    if n == 1 {
        return result
    }
    while(n > 1) {
        if(count >= 500){
            break
        }
        if(n % 2 == 0){
            n /= 2
        } else {
            n = (n * 3) + 1
        }
        count += 1
    }
    if(count >= 500){
        result = -1
    } else {
        result = count
    }
    return result
}