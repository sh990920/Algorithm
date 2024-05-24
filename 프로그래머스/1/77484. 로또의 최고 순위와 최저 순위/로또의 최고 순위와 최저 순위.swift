import Foundation

func solution(_ lottos:[Int], _ win_nums:[Int]) -> [Int] {
    var result = Array<Int>()
    var top = 0
    var low = 0
    for i in lottos {
        if i == 0 {
            top += 1
            continue
        }
        for j in win_nums {
            if i == j {
                top += 1
                low += 1
            }
        }
    }
    result.append(ranking(top))
    result.append(ranking(low))
    return result
}

func ranking(_ num: Int) -> Int {
    var n = 0
    switch num {
    case 6:
        n = 1
    case 5:
        n = 2
    case 4:
        n = 3
    case 3:
        n = 4
    case 2:
        n = 5
    default:
        n = 6
    }
    return n
}