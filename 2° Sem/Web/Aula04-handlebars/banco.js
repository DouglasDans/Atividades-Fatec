const Sequelize = require("sequelize")
const sequelize = new Sequelize("test", "root", "", {
    host: "localhost",
    dialect: "mysql"
})

const Agendamentos = sequelize.define("agendamentos" , {
    nome:{
        type: Sequelize.STRING
    },
    telefone: {
        type: Sequelize.SMALLINT
    },
    origem:{
        type: Sequelize.SMALLINT
    },
    data: {
        type: Sequelize.STRING
    },
    observacao: {
        type: Sequelize.STRING
    },
})
Agendamentos.sync()