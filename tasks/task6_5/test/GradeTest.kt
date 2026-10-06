// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class GradeTest : FreeSpec({
    "Exam grading" - {
        "Fail grades" - {
            "Mark of 0 gives a Fail" {
                grade(0) shouldBe "Fail"
            }
            "Mark of 20 gives a Fail" {
                grade(20) shouldBe "Fail"
            }
            "Mark of 39 gives a Fail" {
                grade(39) shouldBe "Fail"
            }
        }
        "Pass grades" - {
            "Mark of 40 gives a Pass" {
                grade(40) shouldBe "Pass"
            }
            "Mark of 55 gives a Pass" {
                grade(55) shouldBe "Pass"
            }
            "Mark of 69 gives a Pass" {
                grade(69) shouldBe "Pass"
            }
        }
        "Distinction grades" - {
            "Mark of 70 gives a Distinction" {
                grade(70) shouldBe "Distinction"
            }
            "Mark of 85 gives a Distinction" {
                grade(85) shouldBe "Distinction"
            }
            "Mark of 100 gives a Distinction" {
                grade(100) shouldBe "Distinction"
            }
        }
        "Invalid grades" - {
            "Mark of -1 isn't a valid grade" {
                grade(-1) shouldBe "?"
            }
            "Mark of -5 isn't a valid grade" {
                grade(-5) shouldBe "?"
            }
            "Mark of 101 isn't a valid grade" {
                grade(101) shouldBe "?"
            }
            "Mark of 105 isn't a valid grade" {
                grade(105) shouldBe "?"
            }
        }
    }
})
