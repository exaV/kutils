package de.mpicbg.scicomp.bioinfo

/**
 * @author Holger Brandl
 */
import io.kotlintest.matchers.*
import io.kotlintest.specs.StringSpec
import java.io.File


class GtfParserTest : StringSpec() { init {


    val testResourceDir = File("/Users/brandl/projects/kotlin/kutils/src/main/resources/bioinfo/")

    "parse gtf with header" {
        val readGTF = readGTF(File(testResourceDir, "header.gtf")).toList()

        readGTF.size shouldEqual 4
    }
}


    //    "allow to select columsn" {
    //        someFlights().split()
    //                .select(with(3).and(11..13).and(1))
    //                .first().data shouldBe listOf("day", "flight", "tailnum", "origin", "year")
    //    }
    //
    //
    //    "rejeced mixed select" {
    //        shouldThrow<IllegalArgumentException> {
    //            someFlights().split().select(1, -2)
    //        }.message shouldBe "[ERROR] Can not mix positive and negative selections"
    //    }
    //
    //
    //    "compressed lines should be unzipped on the fly"{
    //        resolveArgFile(arrayOf("src/test/resources/flights.tsv.gz")).
    //                drop(1).first() should startWith("2013")
    //    }
}