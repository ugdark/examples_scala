trait UserCreateService {

  /**
    * XXXUser を作成する
    *
    * @param name String
    * @param birthday String 誕生日
    * @return Future.successful(XXXUser, XXXSessionId) 成功した (作成したXXXUserと発行したセッションIDを返す)
    *         Future.failed(IllegalArgumentException) Permanent の XXXしか作成できないように設定された環境で、Permanent 以外の種別を指定した
    *         Future.failed(TooFrequentAccessesException) IPアドレスが連続登録制限を超えている場合
    *         Future.failed(ResourceConflictException) XXXUserIdもしくはXXXDeviceIdが重複した
    *         Future.failed(DatabaseConnectionException) DB接続中にエラーが発生した
    */
//  def create(mail: String, name: String): Future[(User, XXXSessionId)]

}
