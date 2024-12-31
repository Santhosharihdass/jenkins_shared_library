def call(Map config = [:]) {
  sh "Welcomes to convergent network ${config.name}. enjoy the day and work ${config.dayofweek}."
}
