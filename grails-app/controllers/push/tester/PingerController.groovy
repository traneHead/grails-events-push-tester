package push.tester

class PingerController {

    def index() {
      log.info 'called'
      event('savedTodo', [msg: 'Pinged!'], {})
      render(contentType: 'text/json') {[result: 'Pinged to event:savedTodo']}
    }
}
