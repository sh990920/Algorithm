import Foundation

func solution(_ id_list:[String], _ report:[String], _ k:Int) -> [Int] {
    var users = [String: Set<String>]() // 누가 누구를 신고했는지
    var reported = [String: Int]()      // 누가 얼마나 신고를 당했는지

    // 기본값 세팅
    for id in id_list {
        users[id] = []
        reported[id] = 0
    }

    for rpt in Set(report) {
        let reportIDs = rpt.split(separator: " ").map { String($0) }
        let user = reportIDs[0]      // 신고한 사람(유저)
        let reportee = reportIDs[1]  // 신고당한 사람

        users[user]!.insert(reportee) // 누가 누굴 신고했고
        reported[reportee]! +=  1     // 누가 얼마나 신고당했는지
    }

    let idCount = id_list.count
    var mailCounts = Array(repeating: 0, count: idCount)

    // 유저가 신고한 사람 중, k번 이상 신고당한 사람이 있으면 메일 회신(횟수 계산)
    // where조건이 아닌 if조건에서 k 조건을 넣어도 되지만, 코드 가독성을 위해 where절로 조건 사용.
    for i in 0..<idCount {
        for reportee in reported.keys where reported[reportee]! >= k {
            let reporter = id_list[i]

            if users[reporter]!.contains(reportee) {
                mailCounts[i] += 1
            }
        }
    }

    return mailCounts
}