import Foundation

func solution(_ k:Int, _ score:[Int]) -> [Int] {
    var result = Array<Int>()
    var ranking = Array<Int>()

    for i in score {
        if ranking.count >= k {
            if ranking[0] < i {
                ranking[0] = i
            }
        } else {
            ranking.append(i)
        }
        ranking.sort()
        result.append(ranking[0])
    }
    return result
}