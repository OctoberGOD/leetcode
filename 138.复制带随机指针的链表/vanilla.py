class Solution:
    def copyRandomList(self, head: 'Node') -> 'Node':
        lookup = {}
        def dfs(head):
            if not head: return None
            if head in lookup: return lookup[head]
            clone = Node(head.val, None, None)
            lookup[head] = clone 
            clone.next, clone.random = dfs(head.next), dfs(head.random)
            return clone
        return dfs(head)

