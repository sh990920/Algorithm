func solution(_ n:Int64) -> Int64 {
    var result: Int64 = 0
    
    var s_n = String(n)
    
    var arr = Array<Int>()
    
    for i in s_n {
        if let num = Int(String(i)){
            arr.append(num)
        }
    }
    
    arr.sort(by: >) // 내림차순 정렬
    
    var new_str = ""
    
    for i in arr {
        new_str += String(i)
    }
    
    if let new_num = Int64(new_str){
        result = new_num
    }
    
    return result
}