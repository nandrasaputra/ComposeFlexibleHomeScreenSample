package com.example.flexiblehomescreensample

object RawData {
    val firstPage = """
    {
       "data":[
          {
             "widgetId":"c1",
             "widgetType":"Carousel",
             "latestUpdate":"2021-01-21 00:00:00",
             "carousel":{
                "items":[
                   {
                      "itemId":"c1_1",
                      "image":"https://i.ibb.co/C0L7qvf/c1.jpg"
                   },
                   {
                      "itemId":"c1_2",
                      "image":"https://i.ibb.co/fMcN4fw/c2.jpg"
                   },
                   {
                      "itemId":"c1_3",
                      "image":"https://i.ibb.co/wB48K7Z/c3.jpg"
                   }
                ]
             }
          },
          {
             "widgetId":"s1",
             "widgetType":"Slider",
             "latestUpdate":"2021-01-21 00:00:00",
             "slider":{
                "title":"Awesome Slider 1",
                "items":[
                   {
                      "itemId":"s1_1",
                      "image":"https://i.ibb.co/rcVpkpz/001-chest.png",
                      "title":"Chest"
                   },
                   {
                      "itemId":"s1_2",
                      "image":"https://i.ibb.co/VM6FDhv/002-money-bag.png",
                      "title":"Money Bag"
                   },
                   {
                      "itemId":"s1_3",
                      "image":"https://i.ibb.co/pjDBKgm/003-coins.png",
                      "title":"Coins"
                   },
                   {
                      "itemId":"s1_4",
                      "image":"https://i.ibb.co/9tzKKCx/004-gems.png",
                      "title":"Gems"
                   },
                   {
                      "itemId":"s1_5",
                      "image":"https://i.ibb.co/0DMtqWD/045-ice.png",
                      "title":"Ice"
                   },
                   {
                      "itemId":"s1_6",
                      "image":"https://i.ibb.co/c6jFSLb/034-wood.png",
                      "title":"Wood"
                   },
                   {
                      "itemId":"s1_7",
                      "image":"https://i.ibb.co/Pwxhy77/028-diamond.png",
                      "title":"Diamond"
                   },
                   {
                      "itemId":"s1_8",
                      "image":"https://i.ibb.co/VNjJ3F0/015-spear.png",
                      "title":"Spear"
                   }
                ]
             }
          },
          {
             "widgetId":"fb1_1",
             "widgetType":"FloatingButton",
             "latestUpdate":"2021-01-21 00:00:00",
             "floatingButton":{
                "title":"Buy Axe!",
                "description":"Get Your Dream Axe Now",
                "image":"https://i.ibb.co/7SFm5fj/012-axe.png"
             }
          },
          {
             "widgetId":"fb1_2",
             "widgetType":"FloatingButton",
             "latestUpdate":"2021-01-21 00:00:00",
             "floatingButton":{
                "title":"Key Master",
                "description":"Lost Your Key? Click Here",
                "image":"https://i.ibb.co/Db3Rz4g/023-key.png"
             }
          },
          {
             "widgetId":"fb1_3",
             "widgetType":"FloatingButton",
             "latestUpdate":"2021-01-21 00:00:00",
             "floatingButton":{
                "title":"See Other Amazing Stuff",
                "description":"Click Here To See Other Stuff",
                "image":""
             }
          },
          {
             "widgetId":"col1",
             "widgetType":"Collection",
             "latestUpdate":"2021-01-21 00:00:00",
             "collection":{
                "title":"Awesome Collection 1",
                "navigationText":"More Here!",
                "items":[
                   {
                      "itemId":"col1_1",
                      "image":"https://i.ibb.co/kM3hpxZ/col-1.jpg",
                      "title":"Kapal Api",
                      "uom":"Sachet",
                      "price":1000.0
                   },
                   {
                      "itemId":"col1_2",
                      "image":"https://i.ibb.co/bbb0xx7/col-2.png",
                      "title":"Bango",
                      "uom":"Sachet",
                      "price":5000.0
                   },
                   {
                      "itemId":"col1_3",
                      "image":"https://i.ibb.co/Hp3dLQn/col-3.jpg",
                      "title":"Marjan",
                      "uom":"Botol",
                      "price":8000.0
                   },
                   {
                      "itemId":"col1_4",
                      "image":"https://i.ibb.co/6YD8TGw/col-4.jpg",
                      "title":"Appolo",
                      "uom":"Bungkus",
                      "price":10000.0
                   },
                   {
                      "itemId":"col1_5",
                      "image":"https://i.ibb.co/QYrgMfz/col-5.jpg",
                      "title":"Roka",
                      "uom":"Bungkus",
                      "price":20000.0
                   },
                   {
                      "itemId":"col1_6",
                      "image":"https://i.ibb.co/mb2gcNd/col-6.jpg",
                      "title":"Tango",
                      "uom":"Bungkus",
                      "price":6000.0
                   },
                   {
                      "itemId":"col1_7",
                      "image":"https://i.ibb.co/tzXvWgw/col-7.jpg",
                      "title":"Kartingdaeng",
                      "uom":"Botol",
                      "price":7000.0
                   },
                   {
                      "itemId":"col1_8",
                      "image":"https://i.ibb.co/ns5yWxW/col-8.jpg",
                      "title":"Lays",
                      "uom":"Bungkus",
                      "price":8000.0
                   }
                ]
             }
          }
       ],
       "page":{
          "currentPages":1,
          "totalPages":3
       },
       "widgetCount":6
    }
    """.trimIndent()

    val secondPage = """
        {
   "data":[
      {
         "widgetId":"col2_1",
         "widgetType":"Collection",
         "latestUpdate":"2021-01-21 00:00:00",
         "collection":{
            "title":"Awesome Collection 2_1",
            "navigationText":"See More Like This",
            "items":[
               {
                  "itemId":"col2_1_1",
                  "image":"https://i.ibb.co/bQxCXn9/col-30.jpg",
                  "title":"Wafello",
                  "uom":"Bungkus",
                  "price":5500.0
               },
               {
                  "itemId":"col2_1_2",
                  "image":"https://i.ibb.co/FxVt8tW/col-29.jpg",
                  "title":"Roma Malkist",
                  "uom":"Bungkus",
                  "price":7900.0
               },
               {
                  "itemId":"col2_1_3",
                  "image":"https://i.ibb.co/xDQ1Grs/col-28.jpg",
                  "title":"Mastin",
                  "uom":"Botol",
                  "price":8800.0
               },
               {
                  "itemId":"col2_1_4",
                  "image":"https://i.ibb.co/QCjLyqH/col-27.png",
                  "title":"Tiwi Wini Biti",
                  "uom":"Bungkus",
                  "price":2200.0
               },
               {
                  "itemId":"col2_1_5",
                  "image":"https://i.ibb.co/mcv8DQV/col-26.jpg",
                  "title":"Hello Panda",
                  "uom":"Bungkus",
                  "price":7400.0
               },
               {
                  "itemId":"col2_1_6",
                  "image":"https://i.ibb.co/4V6t3C8/col-25.jpg",
                  "title":"Holisticare",
                  "uom":"Box",
                  "price":6500.0
               },
               {
                  "itemId":"col2_1_7",
                  "image":"https://i.ibb.co/fv1N538/col-24.png",
                  "title":"Tolak Angin",
                  "uom":"Sachet",
                  "price":1100.0
               },
               {
                  "itemId":"col2_1_8",
                  "image":"https://i.ibb.co/vcRPZg9/col-23.jpg",
                  "title":"Vicee",
                  "uom":"Bungkus",
                  "price":500.0
               }
            ]
         }
      },
      {
         "widgetId":"col2_2",
         "widgetType":"Collection",
         "latestUpdate":"2021-01-21 00:00:00",
         "collection":{
            "title":"Awesome Collection 2_2",
            "navigationText":"Other Crazy Stuff",
            "items":[
               {
                  "itemId":"col2_2_1",
                  "image":"https://i.ibb.co/Fnjnnpy/col-22.jpg",
                  "title":"Good Day Mocacinno",
                  "uom":"Sachet",
                  "price":1200.0
               },
               {
                  "itemId":"col2_2_2",
                  "image":"https://i.ibb.co/VNcLWzL/col-21.jpg",
                  "title":"Walls Oreo",
                  "uom":"Bungkus",
                  "price":27500.0
               },
               {
                  "itemId":"col2_2_3",
                  "image":"https://i.ibb.co/rsdrm3J/col-20.jpg",
                  "title":"Milkita",
                  "uom":"Bungkus",
                  "price":11500.0
               },
               {
                  "itemId":"col2_2_4",
                  "image":"https://i.ibb.co/YbM5FmL/col-18.jpg",
                  "title":"Pocari Sweat",
                  "uom":"Botol",
                  "price":6600.0
               },
               {
                  "itemId":"col2_2_5",
                  "image":"https://i.ibb.co/2qSrFzy/col-19.jpg",
                  "title":"Tango Waffle",
                  "uom":"Box",
                  "price":7500.0
               },
               {
                  "itemId":"col2_2_6",
                  "image":"https://i.ibb.co/PNYPCBR/col-17.jpg",
                  "title":"Adem Sari",
                  "uom":"Box",
                  "price":7800.0
               },
               {
                  "itemId":"col2_2_7",
                  "image":"https://i.ibb.co/4Pvp8n0/col-16.jpg",
                  "title":"Frestea",
                  "uom":"Botol",
                  "price":3300.0
               },
               {
                  "itemId":"col2_2_8",
                  "image":"https://i.ibb.co/1Rk6FX8/col-15.jpg",
                  "title":"Coca Cola",
                  "uom":"Botol",
                  "price":5000.0
               }
            ]
         }
      },
      {
         "widgetId":"fb2_1",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"Buy Axe!",
            "description":"Get Your Dream Axe Now",
            "image":"https://i.ibb.co/7SFm5fj/012-axe.png"
         }
      },
      {
         "widgetId":"fb2_2",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"Key Master",
            "description":"Lost Your Key? Click Here",
            "image":"https://i.ibb.co/Db3Rz4g/023-key.png"
         }
      },
      {
         "widgetId":"fb2_3",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"See Other Amazing Stuff",
            "description":"Click Here To See Other Stuff",
            "image":""
         }
      },
      {
         "widgetId":"fb2_4",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"See Other Amazing Stuff",
            "description":"Click Here To See Other Stuff",
            "image":""
         }
      }
   ],
   "page":{
      "currentPages":2,
      "totalPages":3
   },
   "widgetCount":6
}
    """.trimIndent()

    val thirdPage = """
        {
   "data":[
      {
         "widgetId":"s3",
         "widgetType":"Slider",
         "latestUpdate":"2021-01-21 00:00:00",
         "slider":{
            "title":"Awesome Slider 3",
            "items":[
               {
                  "itemId":"s3_1",
                  "image":"https://i.ibb.co/K93fcKH/010-helmet.png",
                  "title":"Helmet"
               },
               {
                  "itemId":"s3_2",
                  "image":"https://i.ibb.co/VwfhL2F/016-magician-hat.png",
                  "title":"Magician Hat"
               },
               {
                  "itemId":"s3_3",
                  "image":"https://i.ibb.co/K70ZFgK/022-cooking-pot.png",
                  "title":"Cooking Pot"
               },
               {
                  "itemId":"s3_4",
                  "image":"https://i.ibb.co/tDtdwLS/035-crown.png",
                  "title":"Crown"
               },
               {
                  "itemId":"s3_5",
                  "image":"https://i.ibb.co/ZL1tSyj/044-water.png",
                  "title":"Water"
               },
               {
                  "itemId":"s3_6",
                  "image":"https://i.ibb.co/Lx8qvBW/042-fire.png",
                  "title":"Fire"
               },
               {
                  "itemId":"s3_7",
                  "image":"https://i.ibb.co/K9L6Mmm/043-thunder.png",
                  "title":"Thunder"
               },
               {
                  "itemId":"s3_8",
                  "image":"https://i.ibb.co/djQcMKq/056-cherries.png",
                  "title":"Cherries"
               }
            ]
         }
      },
      {
         "widgetId":"fb3_1",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"Hourglass",
            "description":"Never Lost In Time Again!",
            "image":"https://i.ibb.co/y4mv19N/038-hourglass.png"
         }
      },
      {
         "widgetId":"fb3_2",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"Rocks",
            "description":"Our Finest Rocks",
            "image":"https://i.ibb.co/3sC2CKc/040-rocks.png"
         }
      },
      {
         "widgetId":"fb3_3",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"Costumer Support",
            "description":"Need Help? Click Here!",
            "image":""
         }
      },
      {
         "widgetId":"col3",
         "widgetType":"Collection",
         "latestUpdate":"2021-01-21 00:00:00",
         "collection":{
            "title":"Awesome Collection 3",
            "navigationText":"More Awesome Stuff",
            "items":[
               {
                  "itemId":"col3_1",
                  "image":"https://i.ibb.co/kM3hpxZ/col-1.jpg",
                  "title":"Walls Oreo",
                  "uom":"Pack",
                  "price":20000.0
               },
               {
                  "itemId":"col3_2",
                  "image":"https://i.ibb.co/4Pvp8n0/col-16.jpg",
                  "title":"Frestea",
                  "uom":"Bottle",
                  "price":3000.0
               },
               {
                  "itemId":"col3_3",
                  "image":"https://i.ibb.co/G3fz3bJ/col-11.jpg",
                  "title":"Cadbury",
                  "uom":"Pack",
                  "price":12000.0
               },
               {
                  "itemId":"col3_4",
                  "image":"https://i.ibb.co/q7LLqQF/col-10.jpg",
                  "title":"Kinder Joy",
                  "uom":"Pack",
                  "price":13500.0
               },
               {
                  "itemId":"col3_5",
                  "image":"https://i.ibb.co/98CsVnY/col-9.jpg",
                  "title":"Chitato",
                  "uom":"Bungkus",
                  "price":6000.0
               },
               {
                  "itemId":"col3_6",
                  "image":"https://i.ibb.co/mb2gcNd/col-6.jpg",
                  "title":"Tango",
                  "uom":"Bungkus",
                  "price":6000.0
               },
               {
                  "itemId":"col3_7",
                  "image":"https://i.ibb.co/ns5yWxW/col-8.jpg",
                  "title":"Lays",
                  "uom":"Bungkus",
                  "price":7500.0
               },
               {
                  "itemId":"col3_8",
                  "image":"https://i.ibb.co/2qSrFzy/col-19.jpg",
                  "title":"Tango Waffle",
                  "uom":"Bungkus",
                  "price":12000.0
               }
            ]
         }
      },
      {
         "widgetId":"fb2_4",
         "widgetType":"FloatingButton",
         "latestUpdate":"2021-01-21 00:00:00",
         "floatingButton":{
            "title":"See Other Amazing Stuff",
            "description":"Click Here To See Other Stuff",
            "image":""
         }
      }
   ],
   "page":{
      "currentPages":3,
      "totalPages":3
   },
   "widgetCount":6
}
    """.trimIndent()
}