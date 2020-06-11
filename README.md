# leetcode
1 question per day
来自知乎的借鉴经验：
作者：飘哥
链接：https://www.zhihu.com/question/278552967/answer/634980152
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 
    包括三方面内容：* 刷题注意* 如何刷* 刷题量 随着时间的推移leetcode题库已经非常大。这么多题，如何刷才能更加有效率？如果你是初次刷题，建议：
    第一个建议：每个类型的题目至少要刷10到20到题目。树是一个类型，列表是一个类型啊，搜索中包括二分搜索，堆栈等，至少每个类型10到20道题。其中动态规划方面的题目要多刷，就是多多益善，动态规划就算做了20题50题100题，给你一道动态规划题目，你也不能说100%第一眼就能看出来，他的状态转移方法是什么样的。状态怎么设计，所以刷动态规划的题是多多益善，主要看你个人时间以及能力。以个人喜好，我本人不大愿意在面试时问动态规划问题，因为面试者做得出来就做出的出来，做不出来的人可能给100分钟也做不出来。所以我更会倾向于去面常规问题，比如搜索或者树，重点考察选手的基本功。考察他平时有没有编码的经验。
    第二个建议要有恒心和耐心因为所有类型算下来大约20个左右，每个类型20道题，算下来就有200-300到题目。所以刷200-300道题一定是逃不掉的。那么花的时间就是至少100个小时左右，一天花5小时，就是20天，接近一个月的时间。所以说时间的分配也同样很重要。解答了要刷的题目数量，下面是关于如何刷题，我觉得最好是同一个类型的题目一起刷，比如：周一你就专门刷树的题目，周二专门刷搜索周三专门刷动态规划以此类推。同一类型的题目一起刷的好处在于，你在做同一类型题目的时候，就会寻找出规律，总结出他们有什么相似之处，有什么不同的地方需要注意的。
    关于刷题的具体方法是采用三遍式：
    第一遍：5分钟做不出来就看答案具体是看完题目之后，花5分钟时间去想，如果你没有任何想法，不知道怎么写，甚至不知道题目是什么意思，我建议你直接看答案，不要觉得看答案是很丢脸的事情，或者说不应该看答案。没有人一开始就会写代码，没有人一开始就会各种算法，很多都是通过学习别人的经验掌握知识，所以说看答案非常重要。第1遍就看别人的答案，
    第二遍：尝试不看答案完整实现（一道题不要超过60分钟）第一遍看完答案你可以尝试立马把答案关掉，晚点自己去实现代码的时候不要看任何答案。你第1次去完整的写答案可能需要花比较长的时间，可能花30分钟到60分钟，如果超过60分钟我建议还是再把答案看几遍，一道题尽量自己写答案不要超过60分钟，尽量不看答案的情况下完整实现，通过代码测试。
    第三遍：尝试快速实现，如果15-20分钟内实现不了就看答案。过几天之后，记住不要在自己参考答案写出答案的当天，要过几天之后再去尝试几道题目，这次要尝试快速实现，如果说你在15分钟到20分钟之内实现不了，那么就再看看答案。因为你之前已经做了题目，并且知道算法和大概的流程？第3遍是考验你的编码能力，包括对library和API的熟悉程度，如果说你不能在15分钟到20分钟做完一道题目，我建议你还是继续去看答案，继续熟悉答案代码。这个过程你可以反复循环，如果做过的题目，直到你能够在15分钟到20分钟直接做出来，如果是没做过题目的话，尽量能够在45分钟之内做出来，这里我要强调看代码很重要，很重要，很重要，强调三遍。我自己会经常去看别人代码，大家知道同一个题目有不同的算法，每种算法都有不同的实现方式，我会看至少3~5种，我经常会去分析别人的代码，看别人代码里面有什么缺点，那些东西你要避免的哪些东西你可以学，你觉得他代码写得好看或者说觉得他写的简单简洁又高效，这些都是你可以去学习的。
    从别人的代码中学习，我觉得非常重要。leetcode论坛非常好的，上面有很多不同国家不同背景的人，你会发现很多你之前从来没有用过的API或者数据结构，或者编码风格，你都可以去看，就是去其糟粕取其精华。我觉得至少在论坛上c++方面的代码还是有不少问题的，所以我可以借鉴他们的问题，尽量避免他们犯的错误。在leetcode你不光学习你自己熟悉的语言，如你用Java，也可以看看c++，python，学习新的语言，至少你要能够看得懂，不要求你能够写，但是你一定要会读，能够把一种语言的代码翻译成另外一种语言的代码，这是很重要的能力。同时通过学，看别人代码可以学到新的算法新的数据结构，新的API，甚至模板，最佳实践。
    我通常会看运行时间排名75~90%的代码，通常这部分代码是相对高质量的，不要去看最末尾的代码。就是集中在中前的是最好的，前面速度最快的往往并不是最好的，因为可能只强调速度，做了很多奇怪的优化，有时候我也会做这种事情。为了排名写一些很奇怪的写法，所以中间偏前的代码，我觉得是非常值得参考的。你通过反复阅读这样的代码来提高自己的编码能力。
    我觉得刷题过程中要注意培养三方面能力：
    第一是拓宽思路这么多题目做下来，你会发现有很多算法是你从来没有学过的，即使你完整的上过CS这样的算法课程，也不一定能把每种算法全部吃透。所以说在刷题的过程中，你可以学到新的算法能够拓宽自己的思路，你看到题目，至少要能看他要用什么样的算法，如果你实现上可能有一些问题或者实现不了，至少你的思路要对。
    第二是根据数据规模直接推算时间复杂度你能通过数据规模知道使用使用什么算法，是O(N*log2N) 或者是O(N2)
    第三是代码风格的培养你进公司之后有各种语法检测器帮你找出由于代码风格引起的问题。但是你要培养自己的代码风格一致性。你不一定要遵从某种风格，但是你的风格要一致。代码风格是一个不容易引起注意，但又回避不了的问题。一个人独自开发的工作，对代码风格是没有明显感知的，但一群人一起开发就不一样了，代码风格一致可以提高阅读代码效率，可以减少语法、逻辑理解的歧义，方便更快了解别人的代码，减少沟通成本，也杜绝了以后关于大括号是否需要换行等风格问题的低效争论，团队更加和谐。
