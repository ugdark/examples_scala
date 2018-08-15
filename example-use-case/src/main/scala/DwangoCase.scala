case class Cont[R, A](run: (A => R) => R) {

  def map[B](f: A => B): Cont[R, B] =
    Cont(k => run(a => k(f(a))))

  def flatMap[B](f: A => Cont[R, B]): Cont[R, B] =
    Cont(k => run(a => f(a).run(k)))

}

class DwangoCase {}
