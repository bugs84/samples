package samples

import org.jsoup.Jsoup

def doc = Jsoup.connect("http://en.wikipedia.org/").get()
def newsHeadlines = doc.select("#mp-itn b a")

newsHeadlines.each { println it.text() }

