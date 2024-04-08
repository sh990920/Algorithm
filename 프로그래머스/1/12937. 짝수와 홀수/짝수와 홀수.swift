func solution(_ num:Int) -> String {
    var res: String = "Even"
    if(num % 2 != 0){
        res = "Odd"
    }
    return res
}