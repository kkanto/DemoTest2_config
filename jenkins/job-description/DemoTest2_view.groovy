 
listView('DemoTest2 Jobs') {
    description('DemoTest2 Jobs')
    jobs {
        regex('DemoTest2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
