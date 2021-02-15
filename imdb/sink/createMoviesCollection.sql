db.createCollection( "moviesRated", {
   autoIndexId: true,
   validator: { $jsonSchema: {
      bsonType: "object",
      properties: {
         tconst: {
            bsonType: "string",
            description: "title"
         },
         originalTitle: {
            bsonType: "string",
            description: "title"
         },
         averageRating: {
            bsonType : "double",
            description: "rating"
         },
         numVotes: {
            bsonType : "int",
            description: "num votos"
         }
      }
   } }
} )
