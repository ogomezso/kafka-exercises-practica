db.createCollection( "moviesRated", {
   validator: { $jsonSchema: {
      bsonType: "object",
      required: [ "originalTitle" ],
      properties: {
         originalTitle: {
            bsonType: "string",
            description: "title"
         },
         averageRating: {
            bsonType : "string",
            description: "rating"
         },
         numVotes: {
            bsonType : "string",
            description: "num votos"
         }
      }
   } }
} )