import Foundation

func solution(_ angle:Int) -> Int {
    var res = 0
    if(angle == 90){
        res = 2
    }else if(angle == 180){
        res = 4
    }else{
        res = angle > 90 ? 3 : 1
    }
    return res
}